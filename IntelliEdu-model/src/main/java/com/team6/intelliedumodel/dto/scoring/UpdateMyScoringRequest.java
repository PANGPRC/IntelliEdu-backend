package com.team6.intelliedumodel.dto.scoring;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UpdateMyScoringRequest implements Serializable {
    private static final long serialVersionUID = -3520641049172938943L;

    /**
     * ID
     */
    private Long id;

    /**
     * Result name
     */
    private String resultName;

    /**
     * Result Detail
     */
    private String detail;

    /**
     * Result Image URL
     */
    private String imageUrl;

    /**
     * Result Attribute Array, Intended For Evaluation-Type Applications
     */
    private List<String> attributes;

    /**
     * Score Threshold For This Result, Intended For Grading-Type Applications
     */
    private Integer threshold;
}
