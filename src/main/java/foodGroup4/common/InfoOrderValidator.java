package foodGroup4.common;

import foodGroup4.dto.InfoOrderDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class InfoOrderValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return InfoOrderDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        InfoOrderDto infoOrderDto = (InfoOrderDto) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "newSdt", "field.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "newTen", "field.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "newDiaChi", "field.empty");

        if(infoOrderDto.getNewSdt() != null &&
                (infoOrderDto.getNewSdt().length() < 10 || infoOrderDto.getNewSdt().length() > 11)) {
            errors.rejectValue("newSdt", "khachhang.sdt.invalid");
        }

        if(infoOrderDto.getNewTen() != null &&
                (infoOrderDto.getNewTen().length() < 5 || infoOrderDto.getNewTen().length() > 50)) {
            errors.rejectValue("newTen", "khachhang.ten.invalid");
        }

        if(infoOrderDto.getNewDiaChi() != null &&
                (infoOrderDto.getNewDiaChi().length() < 5 || infoOrderDto.getNewDiaChi().length() > 100)) {
            errors.rejectValue("newDiaChi", "khachhang.diachi.invalid");
        }
    }
}
