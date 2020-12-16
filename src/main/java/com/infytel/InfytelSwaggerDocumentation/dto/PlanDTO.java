package com.infytel.InfytelSwaggerDocumentation.dto;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class PlanDTO {

	Integer planId;
	String planName;
	Integer nationalRate;
	Integer localRate;
}
