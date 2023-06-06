package com.med.voll.api.dto;

import com.med.voll.api.enums.Specialty;

public record MedicDTO( String name, String email, String crm, Specialty specialty) {
}
