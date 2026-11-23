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
 * A representation of the model object '<em><b>CIM Software Feature Software Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SoftwareFeatureSoftwareElements identifies the Software Elements that make up a particular SoftwareFeature.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareFeatureSoftwareElements()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' override.GroupComponent='CIM_SoftwareFeature REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The SoftwareFeature that groups the SoftwareElement.' override.PartComponent='CIM_SoftwareElement REF' override.PartComponent.Description='The SoftwareElement that makes up the Feature.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareFeatureSoftwareElements extends CIM_Component {
} // CIM_SoftwareFeatureSoftwareElements
