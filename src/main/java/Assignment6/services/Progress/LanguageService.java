package Assignment6.services.Progress;

import Assignment6.domain.Progress.Language;
import Assignment6.services.IService;

import java.util.Set;

public interface LanguageService extends IService<Language,String> {
    Set<Language> getAll();
}
