package com.jibrus.jibrus.converters;

import com.jibrus.jibrus.dto.SubjectDto;
import com.jibrus.jibrus.entities.Subject;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubjectEntityToSubjectDtoConverter implements Converter<List<Subject>, List<SubjectDto>> {

    @Override
    public List<SubjectDto> convert(List<Subject> from) {
        List<SubjectDto> subjectDtos = new ArrayList<>();

        for (Subject subject : from) {
            subjectDtos.add(SubjectDto.builder()
                    .id_subject(subject.getId_subject())
                    .name(subject.getName())
                    .build());
        }

        return subjectDtos;
    }

}
