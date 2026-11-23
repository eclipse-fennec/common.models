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
 * A representation of the model object '<em><b>CIM J2ee JDBC Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJDBCDriver class identifies individual JDBC drivers.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJDBCDriver()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID identifies a unique instance of a J2ee JDBCDriver. In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.InstanceID.ModelCorrespondence='[\"CIM_J2eeJDBCDriver.Name\"]' override.Name='string' override.Name.Description='The name of a J2EE JDBCDriver. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' override.Name.ModelCorrespondence='[\"CIM_J2eeJDBCDriver.InstanceID\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJDBCDriver extends CIM_EnabledLogicalElement {
} // CIM_J2eeJDBCDriver
