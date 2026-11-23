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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Contact Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates PRS_Contact and PRS_Organization.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ContactOrganization()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Contact REF' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Contact.' override.Dependent='PRS_Organization REF' override.Dependent.Min='1' override.Dependent.Description='The PRS_Organization.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ContactOrganization extends PRS_ContactContactItem {
} // PRS_ContactOrganization
