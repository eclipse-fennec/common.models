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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Element View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ElementView is used to associate an instance of CIM_View with an instance representing one or more instances of managed resources that contribute to the view.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.34.0' UMLPackagePath='CIM::Core::CoreElements' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='Antecedent shall be a reference to a CIM_ManagedElement that is an instance in the normalized representation of the managed resource that contributes to the view.' override.Dependent='CIM_View REF' override.Dependent.Key='true' override.Dependent.Description='Dependent shall be a reference to an instance of CIM_View that represents a de-normalized or aggregate view of one or more instances that contribute to the view.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementView extends CIM_Dependency {
} // CIM_ElementView
