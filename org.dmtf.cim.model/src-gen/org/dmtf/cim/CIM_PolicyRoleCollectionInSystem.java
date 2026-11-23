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
 * A representation of the model object '<em><b>CIM Policy Role Collection In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicyRoleCollectionInSystem is an association used to establish a relationship between a collection and an 'owning' System such as an AdminDomain or ComputerSystem.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRoleCollectionInSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.Antecedent='CIM_System REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The parent system responsible for the collection.' override.Dependent='CIM_PolicyRoleCollection REF' override.Dependent.Description='The Collection.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRoleCollectionInSystem extends CIM_HostedCollection {
} // CIM_PolicyRoleCollectionInSystem
