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
 * A representation of the model object '<em><b>PRS Administrative Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates PRS_Administrative and PRS_Contact.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_AdministrativeContact()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Administrative REF' override.Antecedent.Aggregate='true' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Administrative instance.' override.Dependent='PRS_Contact REF' override.Dependent.Min='1' override.Dependent.Description='The PRS_Contact.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_AdministrativeContact extends CIM_Dependency {
} // PRS_AdministrativeContact
