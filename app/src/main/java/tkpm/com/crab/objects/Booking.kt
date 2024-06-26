package tkpm.com.crab.objects


import com.google.gson.annotations.SerializedName

data class MongoLocation(
    @SerializedName("_id") val id: String, val type: String, val coordinates: List<Double>
)

data class LocationRecord(
    @SerializedName("_id") val id: String, val address: String, val location: MongoLocation
)

data class Rating(
    @SerializedName("_id")
    val id: String = "",
    val value: Float,
    val comment: String,
    val user: User,
)

data class BookingInfo(
    @SerializedName("_id") val id: String,
    val pickup: LocationRecord,
    val destination: LocationRecord,
    val phone: String,
    val name: String,
    val fee: Int,
    val distance: Double,
    val customer_rating: Rating,
    val driver_rating: Rating,
    val payment_method: String
)

data class Booking(
    @SerializedName("_id")
    val id: String,
    val status: String,
    val info: BookingInfo,
    val service: String,
    val vehicle: String,
    val driver: User,
    val orderedBy: User,
    val createdAt: String,
)

data class BookingVehilce(
    val booking: Booking,
    val vehicleInfo: Vehicle,
    val rateDriver: Double
)


