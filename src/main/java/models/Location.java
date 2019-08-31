package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.io.Serializable;
import java.util.UUID;

import com.google.common.base.Objects;

public class Location implements Serializable {

  public String id;
  public double longitude;
  public double latitude;

  public Location() {
  }

  public Location(double latitude, double longitude) {
    this.id = UUID.randomUUID().toString();
    this.latitude = latitude;
    this.longitude = longitude;
  }


  @Override
  public boolean equals(final Object obj) {
    if (obj instanceof Location) {
      final Location other = (Location) obj;
      return Objects.equal(latitude, other.latitude)
          && Objects.equal(longitude, other.longitude);
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return toStringHelper(this)
        .addValue(latitude)
        .addValue(longitude)
        .toString();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.id, this.latitude, this.longitude);
  }
}