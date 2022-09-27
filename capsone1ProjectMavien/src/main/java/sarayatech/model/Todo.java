package sarayatech.model;

import java.time.LocalDate;

public class Todo {
 
    private String name;
    private LocalDate createdAt;
    private LocalDate enbdAt;
    private boolean status;

    public Todo(String name, LocalDate createdAt, LocalDate enbdAt, boolean status) {
        this.name = name;
        this.createdAt = createdAt;
        this.enbdAt = enbdAt;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getEnbdAt() {
        return enbdAt;
    }

    public void setEnbdAt(LocalDate enbdAt) {
        this.enbdAt = enbdAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", enbdAt=" + enbdAt +
                ", status=" + status +
                '}';
    }
}
