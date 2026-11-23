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
 * A representation of the model object '<em><b>CIM J2ee Resource Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a deployed Resource Adapter within a Resource Adapter Module. The resource adapter is hosted by a J2ee Server and should hence be associated to a J2eeServer instance through the CIM_HostedService association. The scoping keys in the instance are provided by the J2eeServer hosting the resource adapter.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeResourceAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Name='string' override.Name.Description='The name of a J2EE Resource Adapter. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.' override.Name.MaxLen='256' override.Name.MappingStrings='[\"JSR77.JCP|JSR77.3.1.1.1 objectName|V1.0\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeResourceAdapter extends CIM_Service {
} // CIM_J2eeResourceAdapter
