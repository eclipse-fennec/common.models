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
 * A representation of the model object '<em><b>CIM J2ee Server In Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeServerInDomain association identifies the J2EE Server that are part of a J2EE Domain for management purposes.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServerInDomain()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.GroupComponent='CIM_J2eeDomain REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The J2ee Management Domain.' override.PartComponent='CIM_J2eeServer REF' override.PartComponent.Min='1' override.PartComponent.Description='The J2ee Server that is a member of the domain.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeServerInDomain extends CIM_SystemComponent {
} // CIM_J2eeServerInDomain
