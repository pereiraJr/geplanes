<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>

<c:set var="prefix" value="item.${propertyDescription}"/>

<c:if test="${!empty itens}" >
	<c:if test="${renderas=='double'}">
		<n:panel>
			<c:if test="${showLabel}">
				${label}
			</c:if>
			<n:panelGrid columns="${columns}" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px; table-layout: fixed;" columnStyles="text-align:left; padding-right: 10px; padding-left:125px;" columnStyleClasses="propertyColumn,propertyColumn">
				<c:forEach var="item" items="${itens}" varStatus="status">
					<n:panel class="tdRadio checklistlabel">
						<label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;">
							<n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${n:reevaluate(prefix,pageContext)}
						</label>
					</n:panel>
				</c:forEach>
			</n:panelGrid>
		</n:panel>
	</c:if>
	
	<c:if test="${renderas=='vertical'}">
		<c:forEach var="item" items="${itens}" varStatus="status">
			<BR/><n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${labelPrefix}${n:reevaluate(prefix,pageContext)}
		</c:forEach>
	</c:if>
	
	
	<c:if test="${renderas=='line'}">
		<n:panel>
			<c:if test="${showLabel}">
				<n:panel>${label}</n:panel>
			</c:if>
			<n:panelGrid columns="${columns}" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px;table-layout: fixed;" columnStyles="text-align:left;" columnStyleClasses="propertyColumn">
				<c:forEach var="item" items="${itens}" varStatus="status">
					<n:panel class="tdRadio checklistlabel">
						<label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;">
							<n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${n:reevaluate(prefix,pageContext)}
						</label>
					</n:panel>
				</c:forEach>
			</n:panelGrid>
		</n:panel>
	</c:if>
	
	<c:if test="${renderas=='doubleline'}">
		<n:panel>
			<c:if test="${showLabel}">
				<n:panel>${label}</n:panel>
			</c:if>
			<n:panelGrid columns="${columns==null ? 5 : columns}" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px;table-layout: fixed;" columnStyles="text-align:left; padding-right:5px;" columnStyleClasses="propertyColumn,propertyColumn">
				<c:forEach var="item" items="${itens}" varStatus="status">
					<n:panel class="tdRadio checklistlabel">
						<label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;">
							<n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>
							<span style="vertical-align: 4px;">
								${n:reevaluate(prefix,pageContext)}
							</span>
						</label>
					</n:panel>
				</c:forEach>
			</n:panelGrid>
		</n:panel>
	</c:if>
	<c:if test="${renderas=='column'}">
		<n:column>
			<n:header>
				${label}
			</n:header>				
			<n:body>		
				<n:panelGrid columns="${columns}" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px;table-layout: fixed;" columnStyles="text-align:left; padding-right:30px;" columnStyleClasses="checklistdetalhe">
					<c:forEach var="item" items="${itens}" varStatus="status">
						<n:panel class="tdRadio checklistlabel"><label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;"><n:input name="${name}" id="cl_${name}${status.count}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${n:reevaluate(prefix,pageContext)}</label></n:panel>
					</c:forEach>
				</n:panelGrid>
			</n:body>
		</n:column>
	</c:if>
	
	<c:if test="${renderas=='mapa'}">
			<c:if test="${showLabel}">
				<label><br/>${label}</br></label>
			</c:if>
			
			<n:panel class="tdRadio checklistMapa" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px;table-layout: fixed;">
				<c:forEach var="item" items="${itens}" varStatus="status">
					<label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;">
						<n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${n:reevaluate(prefix,pageContext)}
					</label>
				</c:forEach>
			</n:panel>
	</c:if>
	
	<c:if test="${empty renderas}">
		<c:if test="${showLabel}">
			<n:panel>${label}</n:panel>
		</c:if>
		<n:panel>
			<n:panelGrid columns="${columns}" style="margin-left: 10px;width: 99%; height: 100%; border-collapse: separate; border-spacing: 1px; padding: 0px;table-layout: fixed;" columnStyles="text-align:left; padding-right:30px;" columnStyleClasses="propertyColumn,propertyColumn">
				<c:forEach var="item" items="${itens}" varStatus="status">
					<n:panel class="tdRadio checklistlabel">
						<label for="cl_${name}${status.count}" class="radiomapa" style="display: block; width: 100%; margin: 0px; color: #206eac;">
							<n:input name="${name}" id="cl_${name}${status.count}" onchange="${inputOnChange}" onclick="${inputOnClick}" type="checklist" value="${item}" itens="${n:reevaluate(property,pageContext)}"/>${n:reevaluate(prefix,pageContext)}
						</label>
					</n:panel>
				</c:forEach>
			</n:panelGrid>
		</n:panel>
	</c:if>
	
</c:if>
