package repository.impl;

import model.CURRICULUM;
import repository.CurriculumRepository;

import java.util.ArrayList;
import java.util.List;

public class CurriculumRepositoryImpl implements CurriculumRepository {
    private List<CURRICULUM> curricula = new ArrayList<>();

    @Override
    public void newCurricula(CURRICULUM curriculum) {
        curricula.add(curriculum);
    }

    @Override
    public List<CURRICULUM> getCurricula() {
        return curricula;
    }
}
