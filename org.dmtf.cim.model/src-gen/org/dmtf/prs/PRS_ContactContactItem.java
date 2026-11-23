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
 * A representation of the model object '<em><b>PRS Contact Contact Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract root class to associate PRS_Person or PRS_Organization and PRS_Contact.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ContactContactItem()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Contact REF' override.Antecedent.Min='1' override.Antecedent.Description='The PRS_Contact.' override.Dependent='PRS_ContactItem REF' override.Dependent.Min='1' override.Dependent.Description='The PRS_ContactItem, either PRS_Person or PRS_Organization. There is always at least one PRS_ContactItem, however it may be either a PRS_Person or PRS_Organization. For that reason, there is a minimum cardinality of one for this property, but a minimum cardinality of zero in the classes derived from this class.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ContactContactItem extends CIM_Dependency {
} // PRS_ContactContactItem
