package com.hotel.data;

import java.util.Date;

public class Reservation {
    private String reservationId;
    private Client client;
    private Room room;
    private Date startDate;
    private Date endDate;

    public Reservation(String reservationId, Client client, Room room, Date startDate, Date endDate) {
        this.reservationId = reservationId;
        this.client = client;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Client getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", client=" + client +
                ", room=" + room +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
