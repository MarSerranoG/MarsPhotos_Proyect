private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

import retrofit2.Retrofit

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MarsApiService {
    @GET("photos")
    fun getPhotos(): String
}


// Declaración de objeto

object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
