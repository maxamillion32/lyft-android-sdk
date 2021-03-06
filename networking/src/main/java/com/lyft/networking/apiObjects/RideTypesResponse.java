package com.lyft.networking.apiObjects;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class RideTypesResponse {

    @SerializedName("ride_types")
    public final List<RideType> ride_types;

    public RideTypesResponse(List<RideType> ride_types) {
        this.ride_types = ride_types;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RideTypesResponse {\n");

        sb.append("  ride_types: ").append(ride_types).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
