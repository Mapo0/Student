package service.impl;

import model.CURRICULUM;
import repository.CurriculumRepository;
import repository.impl.CurriculumRepositoryImpl;
import service.CurriculumService;

import java.util.List;

public class CurriculumServiceImpl implements CurriculumService {
    private CurriculumRepository curriculumRepository = new CurriculumRepositoryImpl();


    @Override
    public void newCurricula(CURRICULUM curriculum) {
        curriculumRepository.newCurricula(curriculum);

    }

    @Override
    public List<CURRICULUM> getCurricula() {
        return curriculumRepository.getCurricula();
    }
}

