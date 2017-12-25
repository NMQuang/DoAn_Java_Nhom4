package foodGroup4.common.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import foodGroup4.entity.Khachhang;
import foodGroup4.service.CustomerService;

@Component
public class CustomerValidator implements Validator {

	/** The user service. */
	@Autowired
	private CustomerService customerService;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> aClass) {
		return Khachhang.class.equals(aClass);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object kh, Errors errors) {
		try {
			Khachhang khachHang = (Khachhang) kh;

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sdt", "field.empty");
			if (khachHang.getSdt().length() < 10 || khachHang.getSdt().length() > 11) {
				errors.rejectValue("sdt", "khachhang.sdt.invalid");
			} else {
				Khachhang dumpKhachhang = customerService.findBySdt(khachHang.getSdt());
				if(dumpKhachhang != null && dumpKhachhang.getPassword() != null) {
					errors.rejectValue("sdt", "khachhang.sdt.dumplicate");
				}
			}

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.empty");
			if (khachHang.getPassword().length() < 5 || khachHang.getPassword().length() > 45) {
				errors.rejectValue("password", "khachhang.password.invalid");
			}
			if (!khachHang.getRePassword().equals(khachHang.getPassword())) {
				errors.rejectValue("rePassword", "khachhang.repassword.invalid");
			}

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ten", "field.empty");
			if (khachHang.getTen().length() < 5 || khachHang.getTen().length() > 50) {
				errors.rejectValue("ten", "khachhang.ten.invalid");
			}

//			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "NotEmpty");

			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "diaChi", "field.empty");
			if (khachHang.getDiaChi().length() < 5 || khachHang.getDiaChi().length() > 100) {
				errors.rejectValue("diaChi", "khachhang.diachi.invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
