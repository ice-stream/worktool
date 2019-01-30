package cn.itcast.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-12-31T11:14:18.485+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://weather.itcast.cn/", name = "WeatherInterface")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherInterface {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://weather.itcast.cn/", className = "cn.itcast.weather.QueryWeather")
    @WebMethod
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://weather.itcast.cn/", className = "cn.itcast.weather.QueryWeatherResponse")
    public java.util.List<cn.itcast.weather.WeatherModel> queryWeather(
        @WebParam(name = "cityName", targetNamespace = "")
        java.lang.String cityName
    );
}
