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
 * A representation of the model object '<em><b>CIM Contained Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship that aggregates one or more lower-level AdminDomain instances into a higher-level AdminDomain.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ContainedDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Core::CoreElements' override.GroupComponent='CIM_AdminDomain REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='An AdminDomain that aggregates other AdminDomains.' override.PartComponent='CIM_AdminDomain REF' override.PartComponent.Description='An AdminDomain aggregated by another AdminDomain.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ContainedDomain extends CIM_SystemComponent {
} // CIM_ContainedDomain
