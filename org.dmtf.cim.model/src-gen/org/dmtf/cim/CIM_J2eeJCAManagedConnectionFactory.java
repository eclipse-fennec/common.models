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
 * A representation of the model object '<em><b>CIM J2ee JCA Managed Connection Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class identifies JCA managed connection factories.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJCAManagedConnectionFactory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID identifies a unique instance of a J2ee JCAManagedConnectionFactory. In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.InstanceID.ModelCorrespondence='[\"CIM_J2eeJCAManagedConnectionFactory.Name\"]' override.Name='string' override.Name.Description='The name of a J2EE JCAManagedConnectionFactory. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.Name.ModelCorrespondence='[\"CIM_J2eeJCAManagedConnectionFactory.InstanceID\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJCAManagedConnectionFactory extends CIM_EnabledLogicalElement {
} // CIM_J2eeJCAManagedConnectionFactory
