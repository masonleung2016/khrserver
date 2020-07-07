package com.ufostudio.khr.utils;

import com.ufostudio.khr.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Author: LCF
 * @Date: 2020/7/7 9:59
 * @Package: com.ufostudio.khr.utils
 */

public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
