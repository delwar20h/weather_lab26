package com.company.test.util;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.io.IOException;


@Controller
public class HomeController {

   /* // Welcome Page
    @RequestMapping("/")
    public ModelAndView thankyoumessage() {
        return new
                ModelAndView("welcome", "message",
                "Thank you for visiting today.");
    }

    @RequestMapping("response")
    public ModelAndView response(@RequestParam("order") String order) {

        ModelAndView mv = new ModelAndView("receipt");
        mv.addObject("order", order);
        return mv;
    }*/

    @RequestMapping("/")
    public ModelAndView weather() {
        try {
            //this HttpCLient will make requests from the other server
            org.apache.http.client.HttpClient http = HttpClientBuilder.create().build();

            //HttpHost holds connection info
            HttpHost host = new HttpHost("forecast.weather.gov", 80, "http");

            //HttpGet will actually retrieve the information from the
            //specific URI
            HttpGet getPage = new HttpGet("/MapClick.php?lat=42.331427&lon=-83.045754&FcstType=json");

            //actually run it rand pull in the response
            HttpResponse resp = http.execute(host, getPage);

            //get the actual content from inside the response
            String jsonString = EntityUtils.toString(resp.getEntity());
            JSONObject json = new JSONObject(jsonString);

            int status = resp.getStatusLine().getStatusCode();
            String prodCenter = json.get("productionCenter").toString();

            JSONArray days = json.getJSONObject("time").getJSONArray("startPeriodName");
            JSONArray temps = json.getJSONObject("data").getJSONArray("temperature");
            JSONArray weather = json.getJSONObject("data").getJSONArray("weather");
            JSONArray icons = json.getJSONObject("data").getJSONArray("iconLink");


            /*//First, create a Java class - to iterate through the Weather API to get data - works
            with weather class
            ArrayList<Weather> arr = new ArrayList<Weather>();
            // String ArrayList<String> arrTemp = new ArrayList<String>();

            for (int i = 0; i < days.length(); i++) {
               result += "<h3>" + days.getString(i) + "</h3>";
                arr.add(new Weather(days.getString(i),temps.getString(i)));
                //arrTemp.add();

            }

            return new ModelAndView("weather", "infoarray", arr);*/


            //put it in my webpage (ModelAndView)
            ModelAndView mv = new ModelAndView("weather");
            mv.addObject("status", status);
            mv.addObject("prodCenter", prodCenter);
            mv.addObject("day1", days.getString(0));
            mv.addObject("day2", days.getString(1));
            mv.addObject("day3", days.getString(2));
            mv.addObject("day4", days.getString(3));
            mv.addObject("day5", days.getString(4));
            mv.addObject("day6", days.getString(5));
            mv.addObject("day7", days.getString(6));
            mv.addObject("day8", days.getString(7));
            mv.addObject("day9", days.getString(8));
            mv.addObject("day10", days.getString(9));
            mv.addObject("day11", days.getString(10));
            mv.addObject("day12", days.getString(11));
            mv.addObject("day13", days.getString(12));


            mv.addObject("icon1", icons.getString(0));
            mv.addObject("icon2", icons.getString(1));
            mv.addObject("icon3", icons.getString(2));
            mv.addObject("icon4", icons.getString(3));
            mv.addObject("icon5", icons.getString(4));
            mv.addObject("icon6", icons.getString(5));
            mv.addObject("icon7", icons.getString(6));
            mv.addObject("icon8", icons.getString(7));
            mv.addObject("icon9", icons.getString(8));
            mv.addObject("icon10", icons.getString(9));
            mv.addObject("icon11", icons.getString(10));
            mv.addObject("icon12", icons.getString(11));
            mv.addObject("icon13", icons.getString(12));


            mv.addObject("weather1", weather.getString(0));
            mv.addObject("weather2", weather.getString(1));
            mv.addObject("weather3", weather.getString(2));
            mv.addObject("weather4", weather.getString(3));
            mv.addObject("weather5", weather.getString(4));
            mv.addObject("weather6", weather.getString(5));
            mv.addObject("weather7", weather.getString(6));
            mv.addObject("weather8", weather.getString(7));
            mv.addObject("weather9", weather.getString(8));
            mv.addObject("weather10", weather.getString(9));
            mv.addObject("weather11", weather.getString(10));
            mv.addObject("weather12", weather.getString(11));
            mv.addObject("weather13", weather.getString(12));


            mv.addObject("temp1", temps.getString(0));
            mv.addObject("temp2", temps.getString(1));
            mv.addObject("temp3", temps.getString(2));
            mv.addObject("temp4", temps.getString(3));
            mv.addObject("temp5", temps.getString(4));
            mv.addObject("temp6", temps.getString(5));
            mv.addObject("temp7", temps.getString(6));
            mv.addObject("temp8", temps.getString(7));
            mv.addObject("temp9", temps.getString(8));
            mv.addObject("temp10", temps.getString(9));
            mv.addObject("temp11", temps.getString(10));
            mv.addObject("temp12", temps.getString(11));
            mv.addObject("temp13", temps.getString(12));

            return mv;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
