package io.rivigo.Truck.Scheduling;

        import org.hibernate.annotations.BatchSize;
        import org.jetbrains.annotations.NotNull;
        import java.time.ZonedDateTime;

public class User {

    @NotNull
    @BatchSize(size = 30)
    private String Source_city;

    @NotNull
    @BatchSize(size = 30)
    private String Destination_city;

     @NotNull
     private ZonedDateTime timestamp;

    public User(@NotNull String source_city, @NotNull String destination_city, @NotNull ZonedDateTime timestamp) {
        Source_city = source_city;
        Destination_city = destination_city;
        this.timestamp = timestamp;
    }

    public @NotNull String getDestination_city() {
        return Destination_city;
    }

    public void setDestination_city(@NotNull String destination_city) {
        Destination_city = destination_city;
    }

    public @NotNull ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
        setTimestamp();
    }

    public void setTimestamp(@NotNull ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public @NotNull String getSource_city() {
        return this.Source_city;
    }

    public void setSource_city(@NotNull String source_city) {
        this.Source_city = source_city;
    }

    public String toString() {
        return "Person(Source: " + this.Source_city + ", Destination: " + this.Destination_city + " , Pickup Time: " + this.timestamp + ")";
    }
}