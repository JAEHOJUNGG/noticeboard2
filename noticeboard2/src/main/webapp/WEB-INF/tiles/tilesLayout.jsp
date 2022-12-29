<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<header>
    <tiles:insertAttribute name="header"/>
</header>
    <tiles:insertAttribute name = "body"/>
<footer>
    <tiles:insertAttribute name = "footer"/>
</footer>