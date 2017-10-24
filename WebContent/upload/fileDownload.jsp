<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>파일 다운로드</title></head>
<body>

<h2>파일 다운로드 폼</h2>
<s:url id="download" action="fileDownloadAction" />
<s:a href="%{download}"><s:property value="fileDownloadName" /></s:a>

</body>
</html>