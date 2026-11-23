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
 * A representation of the model object '<em><b>CIM J2ee Module Uses JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeModuleUsesJVM association identifies the JVM that a specific Module runs in.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeModuleUsesJVM()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.Dependent='CIM_J2eeModule REF' override.Dependent.Description='The Module that uses a Java Virtual Machine.' override.Antecedent='CIM_J2eeJVM REF' override.Antecedent.Min='1' override.Antecedent.Description='The Java VM on which the module is running.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeModuleUsesJVM extends CIM_HostedDependency {
} // CIM_J2eeModuleUsesJVM
