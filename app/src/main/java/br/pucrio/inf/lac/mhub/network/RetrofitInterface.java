package br.pucrio.inf.lac.mhub.network;

import br.pucrio.inf.lac.mhub.model_server.Response;
import br.pucrio.inf.lac.mhub.model_server.Sensor;
import br.pucrio.inf.lac.mhub.model_server.User;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Functions to communicate with Server using POST and GET
 * @author Luiz Guilherme Pitta
 */
public interface RetrofitInterface {

    /**
     * Connectivity Provider login.
     */
    @POST("login_user/")
    Observable<Response> login(@Body User user);

    /**
     * Updates Connectivity Provider information.
     */
    @POST("register_location")
    Observable<Response> setLocationMobileHub(@Body User user);

    /**
     * Returns if sensor is registered in the database.
     */
    @POST("get_sensor_registered")
    Observable<Response> getSensorRegistered(@Body Sensor sensor);

    /**
     * Updates sensor information in server.
     */
    @POST("set_sensor_parameters")
    Observable<Response> setSensorParameters(@Body Sensor sensor);

    /**
     * Removes sensor from mobile hub and updates its information in server.
     */
    @POST("remove_sensor_mobileHub")
    Observable<Response> removeSensorMobileHub(@Body Sensor sensor);

    /**
     * Converts sensor data.
     */
    @POST("convert_sensor_data")
    Observable<Response> convertSensorData(@Body Sensor sensor);

}
