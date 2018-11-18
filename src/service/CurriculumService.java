package service;

import model.CURRICULUM;

import java.util.List;

public interface CurriculumService {
    void newCurricula(CURRICULUM curriculum);

    List<CURRICULUM> getCurricula();
}
