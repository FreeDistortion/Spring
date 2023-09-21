<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="col-lg-10">
		<form role="form" class="form-horizontal" action=""
			method="get" name="myform">
			<fieldset>
				<div id="legend">
					<legend>아래 양식 작성</legend>
				</div>

				<div class="form-group">
					<!-- job_id -->
					<label class="control-label col-sm-2" for="orgcode">job코드</label>
					<div class="col-sm-3">${dto.job_id }</div>
				</div>



				<div class="form-group">
					<!-- job이름-->
					<label class="control-label col-sm-2" for="deptname">직군명</label>
					<div class="col-sm-3">${dto.job_name }</div>
				</div>
				<div class="form-group">
					<!-- job의 category-->
					<label class="control-label col-sm-2" for="deptStartDay">job의
						카테고리명</label>
					<div class="col-sm-3">${dto.job_category }</div>
				</div>
				<div class="form-group">
					<!-- menupath-->
					<label class="control-label col-sm-2" for="menupath">메뉴경로</label>
					<div class="col-sm-3">${dto.menupath }</div>
				</div>


				<div class="form-group">
					<!-- Button -->
					<div class="col-sm-3 col-sm-offset-2">
						<input type="button" value="수정하기" class="btn btn-success"
							onclick="location.href='/erp/job/getjob?job_id=${dto.job_id}&cmd=modify'" />
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<div>
		<a href="/erp/job/list">직업군목록보기</a>
	</div>
</body>
</html>













