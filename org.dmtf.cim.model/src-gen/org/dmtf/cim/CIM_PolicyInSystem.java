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
 * A representation of the model object '<em><b>CIM Policy In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_PolicyInSystem is a generic association used to establish dependency relationships between Policies and the Systems that host them. These Systems may be ComputerSystems where Policies are 'running' or they may be Policy Repositories where Policies are stored. This relationship is similar to the concept of CIM_Services being dependent on CIM_Systems as defined by the HostedService association. 
 * 
 * Cardinality is Max (1) for the Antecedent/System reference since Policies can only be hosted in at most one System context. Some subclasses of the association will further refine this definition to make the Policies Weak to Systems. Other subclasses of PolicyInSystem will define an optional hosting relationship. Examples of each of these are the PolicyRuleInSystem and PolicyConditionIn PolicyRepository associations, respectively.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyInSystem()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Policy' override.Antecedent='CIM_System REF' override.Antecedent.Max='1' override.Antecedent.Description='The hosting System.' override.Dependent='CIM_Policy REF' override.Dependent.Description='The hosted Policy.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyInSystem extends CIM_HostedDependency {
} // CIM_PolicyInSystem
