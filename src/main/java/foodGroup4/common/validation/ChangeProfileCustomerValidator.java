package foodGroup4.common.validation;

import foodGroup4.dto.KhachhangDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ChangeProfileCustomerValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return KhachhangDto.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        KhachhangDto khachhangDto = (KhachhangDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ten", "field.empty");
        if (khachhangDto.getTen().length() < 5 || khachhangDto.getTen().length() > 50) {
            errors.rejectValue("ten", "khachhang.ten.invalid");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "diaChi", "field.empty");
        if (khachhangDto.getDiaChi().length() < 5 || khachhangDto.getDiaChi().length() > 100) {
            errors.rejectValue("diaChi", "khachhang.diachi.invalid");
        }
    }
}
