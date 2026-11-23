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
 * A representation of the model object '<em><b>CIM J2ee Application Hosted On Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeApplicationHostedOnServer association identifies a hosting J2ee Server for a particular J2EE Application.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeApplicationHostedOnServer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Antecedent='CIM_J2eeServer REF' override.Antecedent.Max='1' override.Antecedent.Description='The hosting J2ee Server.' override.Dependent='CIM_J2eeApplication REF' override.Dependent.Description='The hosted J2ee Application.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeApplicationHostedOnServer extends CIM_HostedDependency {
} // CIM_J2eeApplicationHostedOnServer
