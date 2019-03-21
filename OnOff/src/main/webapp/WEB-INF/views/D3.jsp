<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.bar {
    fill: #FFA2A2;
    fill-opacity: 0.3;
    stroke: #da0833;
    
}
.bar:hover {
    fill: #da0833;
    fill-opacity: 1;
}

.text {
    fill: white;
    font-weight:bold;
}


</style>
<svg width="500" height="300"></svg>
<script src="https://d3js.org/d3.v4.min.js"></script>
<script>
var dataset = [9, 19, 29, 39, 29, 19, 9];
var svg = d3.select("svg");
svg.selectAll("rect")
    .data(dataset)
    .enter().append("rect")
        .attr("class", "bar")
        .attr("height", function(d, i) {return (d*5)})
        .attr("width", 40)
        .attr("x", function(d, i) {return (50 * i)})
        .attr("y", function(d, i) {return (250-d*5)});


svg.selectAll("text")
.data(dataset)
.enter().append("text")
.text(function(d) {return d})
    .attr("class", "text")
    .attr("x", function(d, i) {return 50 * i + 10})
    .attr("y", function(d, i) {return 250-d*5 + 15});



</script>





</head>
<body>





</body>
</html>