<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<? xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>파일 업로드</title></head>
<body>
	<h2>단일 파일 업로드 입력 폼</h2>
	
	<s:form action="fileUploadAction" method="post" enctype="multipart/form-data">
		<s:file name="tempUpload" label="File" />
		<s:submit />
	</s:form>
</body>
</html>