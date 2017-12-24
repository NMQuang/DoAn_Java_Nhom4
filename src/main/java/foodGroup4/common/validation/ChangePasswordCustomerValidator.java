package foodGroup4.common.validation;

import foodGroup4.dto.ChangePasswordDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ChangePasswordCustomerValidator implements Validator{

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ChangePasswordDto changePasswordDto = (ChangePasswordDto) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "oldPassword", "field.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "newPassword", "field.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "reNewPassword", "field.empty");

        if(changePasswordDto.getNewPassword() != null &&
                (changePasswordDto.getNewPassword().length() < 5
                        || changePasswordDto.getNewPassword().length() > 45)) {
            errors.rejectValue("newPassword", "khachhang.password.invalid");
        }

        if(changePasswordDto.getNewPassword() != null && changePasswordDto.getReNewPassword() != null &&
                !changePasswordDto.getReNewPassword().equals(changePasswordDto.getNewPassword())) {
            errors.rejectValue("reNewPassword", "khachhang.repassword.invalid");
        }
    }
}














