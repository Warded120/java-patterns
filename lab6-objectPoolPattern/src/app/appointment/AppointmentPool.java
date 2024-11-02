    package app.appointment;

    import java.util.LinkedList;
    import java.util.Queue;

    public class AppointmentPool {
        private Queue<Appointment> appointmentPool = new LinkedList<Appointment>();
        private int poolSize;
        private boolean allowExpandPool;

        public AppointmentPool(int poolSize, Boolean allowExpandPool) {
            this.poolSize = poolSize;
            this.allowExpandPool = allowExpandPool;

            for (int i = 0; i < poolSize; i++) {
                appointmentPool.add(new Appointment());
            }
        }

        public Appointment borrowAppointment() {
            if (appointmentPool.isEmpty()) {
                if (allowExpandPool) {
                    System.out.println("No appointment available, creating new one");
                    appointmentPool.offer(new Appointment());
                    return appointmentPool.poll();
                } else {
                    System.out.println("No appointment available");
                    return null;
                }
            }
            return appointmentPool.poll();
        }

        public void returnAppointment(Appointment appointment) {
            appointment.reset();
            appointmentPool.offer(appointment);
            System.out.println("appointment returned and reset");
        }
    }
