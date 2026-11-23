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
 * A representation of the model object '<em><b>CIM J2ee Resource On Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeResourceOnServer is an association that establishes the relationship between a J2EE server and its resources.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeResourceOnServer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.GroupComponent='CIM_J2eeServer REF' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The Server exposing the resources.' override.PartComponent='CIM_J2eeResource REF' override.PartComponent.Description='The resource that is a component of the server.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeResourceOnServer extends CIM_ResourceOfSystem {
} // CIM_J2eeResourceOnServer
