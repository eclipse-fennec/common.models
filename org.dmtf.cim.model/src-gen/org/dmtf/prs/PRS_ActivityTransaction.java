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
 * A representation of the model object '<em><b>PRS Activity Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates PRS_Activity with PRS_Transaction.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ActivityTransaction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_Activity REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The PRS_Activity.' override.Dependent='PRS_Transaction REF' override.Dependent.Min='1' override.Dependent.Max='1' override.Dependent.Description='The PRS_Transaction.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ActivityTransaction extends CIM_Dependency {
} // PRS_ActivityTransaction
