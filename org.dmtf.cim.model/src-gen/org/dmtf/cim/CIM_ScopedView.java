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
 * A representation of the model object '<em><b>CIM Scoped View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ScopedView is used to associate an instance of CIM_System with a View instance representing the denormalized view of a managed resource related to the system. The type of relationship is not constrained. Examples include hosting, aggregation, composition, dependencies, etc.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ScopedView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Core::View' override.Antecedent='CIM_System REF' override.Antecedent.Key='true' override.Antecedent.Description='Antecedent shall be a reference to a CIM_System that has a relationship with the managed resource.' override.Dependent='CIM_View REF' override.Dependent.Key='true' override.Dependent.Description='Dependent shall be a reference to an instance of CIM_View that represents a de-normalized or aggregate view of a managed resource that is related to the CIM_System referenced by the Antecedent property.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ScopedView extends CIM_Dependency {
} // CIM_ScopedView
