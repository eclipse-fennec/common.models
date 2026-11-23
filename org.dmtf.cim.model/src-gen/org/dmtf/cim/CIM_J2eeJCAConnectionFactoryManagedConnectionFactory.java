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
 * A representation of the model object '<em><b>CIM J2ee JCA Connection Factory Managed Connection Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeJCAConnectionFactoryManagedConnectionFactory identifies the JCA managed connection factory associated with the corresponding JCA connection factory .
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJCAConnectionFactoryManagedConnectionFactory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Dependent='CIM_J2eeJCAConnectionFactory REF' override.Dependent.Min='1' override.Antecedent='CIM_J2eeJCAManagedConnectionFactory REF' override.Antecedent.Min='1' override.Antecedent.Max='1' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJCAConnectionFactoryManagedConnectionFactory extends CIM_HostedDependency {
} // CIM_J2eeJCAConnectionFactoryManagedConnectionFactory
