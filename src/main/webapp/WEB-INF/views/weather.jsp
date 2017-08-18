<%--
  Created by IntelliJ IDEA.
  User: Delwar
  Date: 8/18/2017
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Weather Forecast</title>
    <link rel = "stylesheet" type = "text/css" href = "/webapp/resources/styles.css" />
</head>
<body>
Response status: ${status}<br/>
Production center: ${prodCenter}<br/>

<h1>Below is the weather for the next 7 days!</h1>

<table>
    <tr>
        <th>Time Of Day</th>
        <th>Details</th>
        <th>Temperature</th>
        <th>Weather Description</th>
    </tr>

    <tr>
        <td>${day1}  </td>
        <td> <img src = "${icon1}"></td>
        <td>${temp1}</td>
        <td>${weather1}</td>
    </tr>

    <tr>
        <td>${day2} </td>
        <td> <img src = "${icon2}"></td>
        <td>${temp2}</td>
        <td>${weather2}</td>
    </tr>

    <tr>
        <td>${day3} </td>
        <td> <img src = "${icon3}"></td>
        <td>${temp3}</td>
        <td>${weather3}</td>
    </tr>

    <tr>
        <td>${day4} </td>
        <td> <img src = "${icon4}"></td>
        <td>${temp4}</td>
        <td>${weather4}</td>
    </tr>

    <tr>
        <td>${day5} </td>
        <td> <img src = "${icon5}"></td>
        <td>${temp5}</td>
        <td>${weather5}</td>
    </tr>

    <tr>
        <td>${day6} </td>
        <td> <img src = "${icon6}"></td>
        <td>${temp6}</td>
        <td>${weather6}</td>
    </tr>

    <tr>
        <td>${day7} </td>
        <td> <img src = "${icon7}"></td>
        <td>${temp7}</td>
        <td>${weather7}</td>
    </tr>

    <tr>
        <td>${day8} </td>
        <td> <img src = "${icon8}"></td>
        <td>${temp8}</td>
        <td>${weather8}</td>
    </tr>

    <tr>
        <td>${day9} </td>
        <td> <img src = "${icon9}"></td>
        <td>${temp9}</td>
        <td>${weather9}</td>
    </tr>

    <tr>
        <td>${day10} </td>
        <td> <img src = "${icon10}"></td>
        <td>${temp10}</td>
        <td>${weather10}</td>
    </tr>

    <tr>
        <td>${day11} </td>
        <td> <img src = "${icon11}"></td>
        <td>${temp11}</td>
        <td>${weather11}</td>
    </tr>

    <tr>
        <td>${day12} </td>
        <td> <img src = "${icon12}"></td>
        <td>${temp12}</td>
        <td>${weather12}</td>
    </tr>

    <tr>
        <td>${day13} </td>
        <td> <img src = "${icon13}"></td>
        <td>${temp13}</td>
        <td>${weather13}</td>
    </tr>


</table>

</body>
</html>
