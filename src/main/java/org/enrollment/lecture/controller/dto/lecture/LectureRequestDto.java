package org.enrollment.lecture.controller.dto.lecture;

public record LectureRequestDto(long lectureId, long userId) {

    public static LectureRequestDto of(long lectureId, long userId) {
        return new LectureRequestDto(lectureId, userId);
    }

}
