/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.prs;

import org.dmtf.cim.CIM_Dependency;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Contact Item Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates PRS_ContactItem with PRS_Address.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ContactItemAddress()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_ContactItem REF' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_ContactItem.' override.Dependent='PRS_Address REF' override.Dependent.Description='The PRS_Address.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ContactItemAddress extends CIM_Dependency {
} // PRS_ContactItemAddress
