package threads;

import java.util.concurrent.*;

public class ConnectionPoolExample {
    // Connection class represents a connection
    static class Connection {
        private final int id;

        public Connection(int id) {
            this.id = id;
        }

        public void close() {
            System.out.println("Closing connection " + id);
        }
    }

    // ConnectionPool class manages a pool of connections
    static class ConnectionPool {
        private final Semaphore semaphore;
        private final Connection[] connections;
        private final boolean[] used;

        public ConnectionPool(int size) {
            semaphore = new Semaphore(size, true);
            connections = new Connection[size];
            used = new boolean[size];
            for (int i = 0; i < size; i++) {
                connections[i] = new Connection(i);
            }
        }

        // method to get a connection from the pool
        public Connection getConnection() throws InterruptedException {
            semaphore.acquire();
            return getNextAvailableConnection();
        }

        // method to return a connection to the pool
        public void returnConnection(Connection connection) {
            if (releaseConnection(connection)) {
                semaphore.release();
            }
        }

        private synchronized Connection getNextAvailableConnection() {
            for (int i = 0; i < connections.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    return connections[i];
                }
            }
            return null;
        }

        private synchronized boolean releaseConnection(Connection connection) {
            for (int i = 0; i < connections.length; i++) {
                if (connections[i] == connection) {
                    if (used[i]) {
                        used[i] = false;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
    }

    // Thread that gets a connection from the pool and uses it
    // for a short period of time before returning it
    static class Worker implements Runnable {
        private final ConnectionPool pool;

        public Worker(ConnectionPool pool) {
            this.pool = pool;
        }

        @Override
        public void run() {
            try {
                Connection connection = pool.getConnection();
                System.out.println("Got connection " + connection.id);
                Thread.sleep(1000);
                pool.returnConnection(connection);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create a connection pool
        ConnectionPool pool = new ConnectionPool(5);

        // Create a thread pool with 7 worker threads
        Executor executor = Executors.newFixedThreadPool(7);
        for (int i = 0; i < 7; i++) {
            executor.execute(new Worker(pool));
        }

        // Shut down the thread pool
        ((ExecutorService) executor).shutdown();
    } }