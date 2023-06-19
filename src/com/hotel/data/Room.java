package com.hotel.data;

public class Room {
    private String roomId;
    private RoomType roomType;
    private boolean isAvailable;

    public Room(String roomId, RoomType roomType, boolean isAvailable) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    public String getRoomId() {
        return roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType=" + roomType +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
