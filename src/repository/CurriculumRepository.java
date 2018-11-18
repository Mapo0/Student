package repository;

import model.CURRICULUM;

import java.util.List;

public interface CurriculumRepository {
    void newCurricula(CURRICULUM curriculum);

    List<CURRICULUM> getCurricula();
}
